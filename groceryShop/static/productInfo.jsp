<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="groceryServlet" method="get">
    <input type="number" placeholder="Product ID" name="productId" value="${ID}">
    <input type="text" placeholder="Product name" name="productName" value="${Name}">
    <input type="text" placeholder="Product Price" name="productPrice" value="${Price}">
    <input type="text" placeholder="Product Rating" name="productRating" value="${Rating}">
    <input type="text" placeholder="Product Review" name="productReview" value="${Review}">
    <button type="submit">Submit</button>
    <h4>${msg}</h4>

</form>
</body>
</html>