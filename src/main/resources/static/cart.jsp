<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Shopping Cart</title>
    <link rel="stylesheet" href="styles.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/css/bootstrap.min.css">
</head>
<body>

<!-- Header -->
<header id="header" class="site-header header-scrolled position-fixed text-black bg-light">
    <nav id="header-nav" class="navbar navbar-expand-lg px-3 mb-3">
        <div class="container-fluid">
            <a class="navbar-brand" href="index.html">
                <img src="images/main-logo.png" class="logo" alt="Logo">
            </a>
            <div class="offcanvas offcanvas-end" tabindex="-1" id="bdNavbar">
                <div class="offcanvas-header px-4 pb-0">
                    <button type="button" class="btn-close btn-close-black" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                </div>
                <div class="offcanvas-body">
                    <ul class="navbar-nav text-uppercase justify-content-end align-items-center flex-grow-1 pe-3">
                        <li class="nav-item"><a class="nav-link me-4" href="#billboard">Home</a></li>
                        <li class="nav-item"><a class="nav-link me-4" href="#company-services">Services</a></li>
                        <li class="nav-item"><a class="nav-link me-4" href="#mobile-products">Products</a></li>
                        <li class="nav-item dropdown">
                            <a class="nav-link me-4 dropdown-toggle link-dark" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false">Pages</a>
                            <ul class="dropdown-menu">
                                <li><a href="about.html" class="dropdown-item">About</a></li>
                                <li><a href="cart.html" class="dropdown-item active">Cart</a></li>
                                <li><a href="checkout.html" class="dropdown-item">Checkout</a></li>
                            </ul>
                        </li>
                        <li class="nav-item">
                            <div class="user-items ps-5">
                                <ul class="d-flex justify-content-end list-unstyled">
                                    <li><a href="cart.html"><svg class="cart"><use xlink:href="#cart"></use></svg></a></li>
                                </ul>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </nav>
</header>

<!-- Cart Section -->
<main class="container mt-5 pt-5">
    <h1>Your Shopping Cart</h1>
    <table class="table table-bordered mt-3">
        <thead>
        <tr>
            <th>Product</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Total</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Product 1</td>
            <td>$10.00</td>
            <td><input type="number" value="1" min="1" class="form-control" style="width: 60px;"></td>
            <td>$10.00</td>
            <td><button class="btn btn-danger">Remove</button></td>
        </tr>
        <tr>
            <td>Product 2</td>
            <td>$15.00</td>
            <td><input type="number" value="1" min="1" class="form-control" style="width: 60px;"></td>
            <td>$15.00</td>
            <td><button class="btn btn-danger">Remove</button></td>
        </tr>
        </tbody>
    </table>
    <div class="cart-summary">
        <h2>Cart Summary</h2>
        <p>Subtotal: <span id="subtotal">$25.00</span></p>
        <p>Shipping: <span id="shipping">$5.00</span></p>
        <p><strong>Total: <span id="total">$30.00</span></strong></p>
        <button class="btn btn-primary">Proceed to Checkout</button>
    </div>
</main>

<!-- Footer -->
<footer class="text-center mt-5">
    <p>&copy; 2024 Your Store</p>
</footer>

<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
</body>
</html>
