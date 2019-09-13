<template>
    <div>
        <Header2></Header2>
        <div style="width: 100%;">
            <img src="../assets/banner-detailproduk.jpg" alt class="img-fluid img-header">
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <img src="../assets/bebelac.png" alt class="img-fluid" width="400" height="400">
                </div>
                <div class="col-md-6">
                    <div class="title-detail">
                        <h5>Bebelac 4 Bebenutri Plus Susu Pertumbuhan Madu</h5>
                    </div>
                    <div class="produk-price">
                        <span class="new-price">
                            Rp. 105,000
                        </span>
                    </div>
                    <div class="produk-desc">
                        <p>Lorem Ipsum is simply dummy text of the printing and 
                            typesetting industry. Lorem Ipsum has been the industry's 
                            standard dummy text ever since the 1500s, when an unknown 
                            printer took a galley of type and scrambled it to make a type 
                            specimen book. It has survived not only five centuries, but also 
                            the leap into electronic typesetting, remaining essentially 
                            unchanged
                        </p>
                    </div>
                    <div class="float-right">
                        <a href="#/keranjang" class="btn-detail">add to cart</a>
                    </div>
                    <div class="produk-share">
                        <h3>Share this product</h3>
                        <ul>
                            <li>
                                <a href="#">
                                    <i class="fab fa-facebook-square"></i>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <i class="fab fa-twitter-square"></i>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <i class="fab fa-pinterest-square"></i>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <i class="fab fa-instagram"></i>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <Footer></Footer>
    </div>
    
</template>

<style>
.img-header{
    object-fit: cover;
    width: 100%;
    height: 300px;
    margin-bottom: 5%;
    margin-top: -75px;
}
.title-detail h5{
    font-size: 30px;
    font-weight: 700;
    margin-bottom: 10px;
    font-family: 'Montserrat',sans-serif;
}
.produk-price{
    color: #222;
    font-size: 30px;
    font-weight: 600;
    margin-bottom: 30px;
}
.produk-price .new-price{
    color:rgb(224, 42, 42)
}
.produk-desc {
    margin-top: 10px;
    margin-bottom: 0;
    line-height: 26px;
    font-size: 14px;
}
.produk-desc p {
    font-size: 14px;
    line-height: 25px;
    color: #222;
    margin-bottom: 30px;
    font-family: 'Montserrat',sans-serif;
}
.btn-detail{
    border: none !important;
    height: 42px !important;
    line-height: 40px !important;
    background: rgb(224, 42, 42);
    color: #fff;
    display: inline-block;
    font-size: 12px;
    font-weight: 700;
    height: 38px;
    letter-spacing: .1em;
    line-height: 38px;
    overflow: hidden;
    padding: 0 30px;
    text-shadow: none;
    text-transform: uppercase;
    -webkit-transition: all .3s ease;
    transition: all .3s ease;
    vertical-align: middle;
    border-radius: 5px;
    cursor: pointer;
    font-family: 'Montserrat',sans-serif;
}
.float-right{
    margin-bottom: 30px;
}
.float-right a:hover{
    color:#fff;
    text-decoration: none !important;
}
.produk-share{
    margin-bottom: 0;
    padding: 15px 0;
    width: 100%;
}
.produk-share h3{
    color: #222;
    display: inline-block;
    font-size: 15px;
    font-weight: bold;
    margin-right: 15px;
    margin-top: 50px;
    text-transform: uppercase;
    font-family: 'Montserrat',sans-serif;
}
.produk-share ul{
    display: inline-block;
    margin-bottom: 10px;
}
.produk-share ul li{
    display: inline-block;
    list-style: none;
    margin-bottom: 0;
    margin-right: 15px;
    position: relative;
}
.produk-share ul li a{
    color: #363636;
    display: block;
    font-size: 25px;
    text-align: center;
    text-transform: uppercase;
}
</style>

<script>
import Header2 from '@/components/Header2.vue'
import Footer from '@/components/Footer.vue'

export default {
    data(){
        return
    },

    components:{
        Header2,
        Footer
    }
}
</script>