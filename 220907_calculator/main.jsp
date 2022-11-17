<!DOCTYPE html>
<html>
    <head>
        <title>Calculator</title>
        <link rel="stylesheet" href="style.css">        
    </head>
    <body>
        <main>            
            <input type="text" disabled>
            <div class="button-wrap">
                <button data-type="ac" class="ac">AC</button>
                <button data-type="operator">&divide;</button>
                <button>7</button>
                <button>8</button>
                <button>9</button>
                <button data-type="operator">&times;</button>
                <button>4</button>
                <button>5</button>
                <button>6</button>
                <button data-type="operator">-</button>
                <button>1</button>
                <button>2</button>
                <button>3</button>
                <button data-type="operator">+</button>
                <button class="zero">0</button>
                <button>.</button>
                <button data-type="equals" class="equals">=</button>
            </div>
        </main>
        <script src="script.js"></script>
    </body>
</html>