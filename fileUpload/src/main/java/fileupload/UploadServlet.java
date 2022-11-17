package fileupload;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

public class UploadServlet extends HttpServlet {
	Map<String, String> multi = new HashMap<>();
	int fno = 1;
	int vno = 1;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");

		resp.setContentType("text/html; charset=utf-8");

		PrintWriter writer = resp.getWriter();
		writer.println("<html><body>");

		String contentType = req.getContentType();
		if (contentType != null
				&& contentType.toLowerCase().startsWith("multipart/")) {
			printPartInfo(req, writer);
		} else {
			writer.println("multipart พฦดิ");
		}
		writer.println("</body></html>");
		req.setAttribute("multi", multi);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/result.jsp");
        dispatcher.forward(req, resp);
	}

	private void printPartInfo(HttpServletRequest req, PrintWriter writer)
			throws IOException, ServletException {
		Collection<Part> parts = req.getParts();
		for (Part part : parts) {
			writer.println("<br/> name = " + part.getName());
			String contentType = part.getContentType();
			writer.println("<br/> contentType = " + contentType);
			if (part.getHeader("Content-Disposition").contains("filename=")) {
				writer.println("<br/> size = " + part.getSize());
				String fileName = part.getSubmittedFileName();
				writer.println("<br/> filename = " + fileName);
				if (part.getSize() > 0) {
					part.write("c:\\Temp\\" + fileName);
					multi.put("file"+(fno++), fileName);
					part.delete();
				}
			} else {
				String value = req.getParameter(part.getName());
				writer.println("<br/> value = " + value);
				multi.put("var"+(vno++), value);
			}
			writer.println("<hr/>");
		}
	}

}
