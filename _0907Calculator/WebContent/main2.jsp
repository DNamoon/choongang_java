<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
        .divTable.minimalistBlack{
            cursor: pointer;
        }
        div.minimalistBlack {
            border: 3px solid #000000;
            width: 50%;
            text-align: center;
            border-collapse: collapse;
        }

        .divTable.minimalistBlack .divTableCell,
        .divTable.minimalistBlack .divTableHead {
            border: 1px solid #000000;
            padding: 15px 4px;
        }

        .divTable.minimalistBlack .divTableBody .divTableCell {
            font-size: 13px;
        }

        .divTable.minimalistBlack .divTableHeading {
            background: #CFCFCF;
            background: -moz-linear-gradient(top, #dbdbdb 0%, #d3d3d3 66%, #CFCFCF 100%);
            background: -webkit-linear-gradient(top, #dbdbdb 0%, #d3d3d3 66%, #CFCFCF 100%);
            background: linear-gradient(to bottom, #dbdbdb 0%, #d3d3d3 66%, #CFCFCF 100%);
            border-bottom: 3px solid #000000;
        }

        .divTable.minimalistBlack .divTableHeading .divTableHead {
            font-size: 15px;
            font-weight: bold;
            color: #000000;
            text-align: center;
        }

        .minimalistBlack .tableFootStyle {
            font-size: 14px;
            font-weight: bold;
            color: #000000;
            border-top: 3px solid #000000;
        }

        .minimalistBlack .tableFootStyle {
            font-size: 14px;
        }

        /* DivTable.com */
        .divTable {
            display: table;
        }

        .divTableRow {
            display: table-row;
        }

        .divTableHeading {
            display: table-header-group;
        }

        .divTableCell,
        .divTableHead {
            display: table-cell;
        }

        .divTableHeading {
            display: table-header-group;
        }

        .divTableFoot {
            display: table-footer-group;
        }

        .divTableBody {
            display: table-row-group;
        }
    </style>
    <script>
    	var expression='';
    	var result='';
    </script>
</head>
<body>
<div class="divTable minimalistBlack">
        <div class="divTableHeading">
            <div class="divTableRow">
                <div class="divTableHead">계산기</div>
            </div>
        </div>
        <div class="divTableBody">
            <div class="divTableRow">
                <div class="divTableCell" onclick="alert('나머지')"><b>%</b></div>
                <div class="divTableCell" onclick="reset()"><b>C</b></div>
                <div class="divTableCell"><b>Del</b></div>
                <div class="divTableCell" onclick="eval()"><b>/</b></div>
            </div>
            <div class="divTableRow">
                <div class="divTableCell">7</div>
                <div class="divTableCell">8</div>
                <div class="divTableCell">9</div>
                <div class="divTableCell"><b>X</b></div>
            </div>
            <div class="divTableRow">
                <div class="divTableCell">4</div>
                <div class="divTableCell">5</div>
                <div class="divTableCell">6</div>
                <div class="divTableCell"><b>-</b></div>
            </div>
            <div class="divTableRow">
                <div class="divTableCell">1</div>
                <div class="divTableCell">2</div>
                <div class="divTableCell">3</div>
                <div class="divTableCell">+</div>
            </div>
            <div class="divTableRow">
                <div class="divTableCell"></div>
                <div class="divTableCell">0</div>
                <div class="divTableCell">.</div>
                <div class="divTableCell" style="background-color: rgb(61, 61, 167);"><b>=</b></div>
            </div>
        </div>
    </div>
</body>
</html>