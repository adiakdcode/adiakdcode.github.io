const navSlide = ()=> {
    const lineq = document.querySelector(".lineq");
    const nav = document.querySelector(".nav-links");
    const navLinks = document.querySelectorAll(".nav-links li");

    lineq.addEventListener("click",()=>{
        nav.classList.toggle("nav-active");
    });
    navLinks.forEach((link, index) => {
        link.style.animation = `navLinkFade 0.5s ease forwards ${index / 7 + 0.5}s`;

    });
}
navSlide();