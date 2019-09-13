<template>
    <div>
        <div style="width: 100%;">
            <img src="../assets/banner-detailproduk.jpg" alt class="img-fluid img-header">
        </div>

        <section class="terpopuler" style="background-color:#fff;">
            <div class="container">
                    <div class="row">
                        <div class="col-md-12 tittle-pop">
                            <h5 class="text-center">Artikel</h5>
                            <hr>
                        </div>
                    </div>
                    
                    <div class="row">
                        <div class="col-md-6">
                            <img src="../assets/f.jpg" alt class="img-fluid">
                        </div>

                        <div class="col-md-6">
                            <p>
                                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
                                when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, 
                                but also the leap into electronic typesetting, remaining essentially unchanged
                            </p>
                        </div>
                    </div>
                    
                    <div class="row" style="margin-top: 30px;">
                        <div class="col-md-6">
                            <p>
                                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
                                when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, 
                                but also the leap into electronic typesetting, remaining essentially unchanged
                            </p>
                        </div>

                        <div class="col-md-6">
                            <img src="../assets/g.jpg" alt class="img-fluid">
                        </div>
                    </div>

                    <div class="row" style="margin-top: 30px;">
                        <div class="col-md-6">
                            <img src="../assets/a.jpg" alt class="img-fluid">
                        </div>

                        <div class="col-md-6">
                            <p>
                                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
                                when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, 
                                but also the leap into electronic typesetting, remaining essentially unchanged
                            </p>
                        </div>
                            
                    </div>
                    
            </div>
        </section>

        <Footer></Footer>
    </div>
</template>

<script>
import Footer from "@/components/Footer.vue"

export default {
    data(){
        return{
            
        }
    },

    components:{
        Footer
    }
}
</script>