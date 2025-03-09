<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<footer>
    <div class="container">
        <div class="footer-content">
            <div class="footer-section">
                <img src="${pageContext.request.contextPath}/Img/afdal_logo.png" alt="Afdal Group" style="height: 60px;">
                <h3>Afdal Setup UAE</h3>
                <p>We are dedicated to helping entrepreneurs and companies navigate the complexities of establishing their ventures in one of the world's most dynamic markets.</p>
                <div class="newsletter">
                    <input type="email" placeholder="Email Address">
                    <button type="submit"><i class="fas fa-arrow-right"></i></button>
                </div>
            </div>
            <div class="footer-section">
                <h3>Useful Links</h3>
                <ul>
                    <li><a href="#">Business Setup in UAE Mainland</a></li>
                    <li><a href="#">Business Setup in UAE Freezone</a></li>
                    <li><a href="#">Business Bank Account Assistance</a></li>
                    <li><a href="#">Accounting Services Assistance</a></li>
                    <li><a href="#">Privacy Policy</a></li>
                    <li><a href="#">Terms & Conditions</a></li>
                </ul>
            </div>
            <div class="footer-section">
                <h3>Contact Info</h3>
                <ul class="contact-info">
                    <li><i class="fas fa-map-marker-alt"></i> 1204-1205 ,Sobha Ivory 1 – Business Bay – Dubai -UAE</li>
                    <li><i class="fas fa-phone"></i> +97145577830</li>
                    <li><i class="fas fa-envelope"></i> info@afdalsetupuae.com</li>
                </ul>
                <h3>Follow Us</h3>
                <div class="social-links">
                    <a href="#"><i class="fab fa-facebook"></i></a>
                    <a href="#"><i class="fab fa-instagram"></i></a>
                    <a href="#"><i class="fab fa-twitter"></i></a>
                    <a href="#"><i class="fab fa-linkedin"></i></a>
                </div>
            </div>
        </div>
        <div class="footer-bottom">
            <p>© <%= java.time.Year.now().getValue() %> Design by PerLight Softech Solutions</p>
            <div class="payment-methods"></div>
        </div>
    </div>
</footer>