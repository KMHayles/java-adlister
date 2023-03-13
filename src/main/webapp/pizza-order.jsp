<%--
  Created by IntelliJ IDEA.
  User: kennethhayles
  Date: 3/13/23
  Time: 9:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<div class="container">
    <h1>Order Your PIE!</h1>
    <form method="POST">
        <label for="crust-select">Select your crust:</label>
            <select name="crust-select" id="crust-select">
                <option value="regular">Regular</option>
                <option value="buttered">Buttered</option>
                <option value="garlic">Garlic</option>
                <option value="stuffed">Stuffed</option>
            </select>
        <label for="sauce-select">Select your sauce:</label>
            <select name="sauce-select" id="sauce-select">
                <option value="marinara">Marinara</option>
                <option value="alfredo">Alfredo</option>
                <option value="none">None</option>
            </select>
        <label for="size-select">Select your size:</label>
            <select name="size-select" id="size-select">
                <option value="sm">Small</option>
                <option value="md">Medium</option>
                <option value="lg">Large</option>
                <option value="xlg">Extra Large</option>
            </select>
        <fieldset>
            <legend>Choose your toppings:</legend>
            <div>
                <input type="checkbox" id="pepperoni" name="pepperoni" checked>
                <label for="pepperoni">Pepperoni</label>
            </div>
            <div>
                <input type="checkbox" id="cheese" name="cheese">
                <label for="cheese">Cheese</label>
            </div>
            <div>
                <input type="checkbox" id="bacon" name="bacon">
                <label for="bacon">Bacon</label>
            </div>
        </fieldset>
        <br>
        <label for="address">Please Enter your Address:</label>
        <input type="text" id="address" name="address">
        <br>
        <button type="submit">Submit your Order</button>
    </form>

</div>
</body>
</html>
