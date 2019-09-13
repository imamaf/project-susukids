<template>
    <div>
        <Header2></Header2>
        <b-carousel
            id="carousel-1"
            v-model="slide"
            :interval="4000"
            controls
            indicators
            background="#ababab"
            img-width="1024"
            img-height="480"
            style="text-shadow: 1px 1px 2px #333; margin-top: -75px;"
            @sliding-start="onSlideStart"
            @sliding-end="onSlideEnd">

            <b-carousel-slide>
                <img
                    slot="img"
                    class="d-block img-fluid w-100"
                    width="1024"
                    height="480"
                    src="../assets/banner-1.jpg"
                    alt="image slot"
                >
            </b-carousel-slide>

            <b-carousel-slide>
                <img
                    slot="img"
                    class="d-block img-fluid w-100"
                    width="1024"
                    height="480"
                    src="../assets/banner-2.jpg"
                    alt="image slot"
                >
            </b-carousel-slide>

            <b-carousel-slide>
                <img
                    slot="img"
                    class="d-block img-fluid w-100"
                    width="1024"
                    height="480"
                    src="../assets/banner-cart-2.jpg"
                    alt="image slot"
                >
            </b-carousel-slide>
        </b-carousel>

        <section class="terpopuler">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 tittle-pop">
                        <h5 class="text-center">Produk Populer</h5>
                        <hr>
                    </div>
                </div>
                    
                        <div class="row">
                            <div class="col-md-3" v-for="product in products" :key="product.id">
                                <div class="thumb-wrapper" >
                                    <div class="img-box">
                                        <img src="../assets/bebelac.png" class="img-responsive img-fluid" alt="">
                                    </div>
                                    <div class="thumb-content">
                                        <p><strong>{{ product.merk }}</strong></p>
                                        <p>{{ product.price }}</p>
                                        <a href="#/detailproduk" class="btn btn-populer">BELI <i class="fa fa-angle-right"></i></a>
                                    </div>						
                                </div>
                            </div>
                            
                        </div>
                    
                    
            </div>
        </section>

        <Footer></Footer>
    </div>

</template>

<style>

section{
    min-height: 600px;
}
.tittle-pop h5{
    margin-top: 30px;
    font-weight: bold;
    color: #575757;
    font-family: 'Montserrat',sans-serif;
}
.terpopuler{
    background: aliceblue;
}
.terpopuler hr {
    width: 80px;
    border-top: 3px solid #EAA103;
}
.thumb-wrapper {
    border-radius: 8px;
	margin: 5px;
	text-align: left;
    background: #fff;
    box-shadow: 0px 2px 2px rgba(0,0,0,0.1);   
}
.thumb-content {
	padding: 15px;
	font-size: 13px;
}
.thumb-content p {
    font-size: 14px;
    font-family: 'Montserrat',sans-serif;
}
.btn-populer {
    background: #EAA103;
    color: #fff;
    font-weight: 400;
    margin-left: 60px;
    margin-right: 60px;
    display: block;
}
.btn-populer:hover {
    background: #ffc107;
    color: #fff;
}
.img-box{
    width: 200px;
    display: block;
    margin-left: auto;
    margin-right: auto;
}
.main-footer {
    padding: 15px;
    color: #fff;
    border-top: 1px solid #dee2e6;
    background:#EAA103;
}

</style>

<script>
import Header from "@/components/Header2.vue"
import Footer from "@/components/Footer.vue"
import axios from 'axios'

export default {
    data() {
        return {
            products: []
        }
    },

    components:{
        Header2,
        Footer
    },

    methods: {
        load(){
            axios.get('http://localhost:3000/api/Commodity')
            .then((res)=>{
                this.products = res.data;
            })
            .catch(()=>{
                alert('Error load data');
            })
        },
        edit(){
            alert('proses')
        }
    },

    mounted(){
        this.load()
    }
}
</script>
