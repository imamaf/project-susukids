<template>
    <div> <!--Harus dibuat manual, sbelum copy dari bootstrapnya -->
        <Header2></Header2>
            <img src="../assets/banner-2.jpg" alt="Susu Kids" class="img-header">
            
            <div class="container">
                <div class="row">
                    <div class="col-md-6"> <!--col=12 jika ingin dibuat jadi 2 bagian maka col-md-6 begitupun jika ingin dibagi 3 maka col-md-4-->
                        <div class="informasi">
                            <h5><strong>Informasi Pengiriman</strong></h5>
                        </div>
                        <div class="isi-informasi">
                            <ul>
                                <li>
                                    <span style="font-weight:bold;">Penerima: </span>Sarah
                                </li>
                                <li>
                                    <span style="font-weight:bold;">No.Telepon: </span>0989765667675
                                </li>
                                <li>
                                    <span style="font-weight:bold;">Alamat: </span>Depok
                                </li>
                            </ul>
                        </div>
                        <br>
                        <div class="informasi-tambahan">
                            <h5><strong>Informasi Tambahan</strong></h5>
                            <p>Demi kelancaran proses pengiriman produk. maka kami memberikan batasan waktu penerimaan dana yang masuk ke rekening perusahaan agar produk dapat dikirim dihari yang sama</p>
                            <p style="font-weight:bold;">Senin-Jumat paling lambat jam 15:00 </p>
                            <p>Jika dana yang kami terima melebihi dari jam tersebut maka pengiriman akan dilakukan dihari berikutnya. kecuali hari libur</p>
                        </div>
                        
                    </div>
                    <div class="col-md-6">
                        <div class="pesanan-anda">
                            <div class="detail-pesanan">
                                <h5>PESANAN ANDA</h5>
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th scope="col">PRODUK</th>
                                            <th scope="col">QTY</th>
                                            <th scope="col">TOTAL</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>Bebelac 4 Bebenutri</td>
                                            <td>1</td>
                                            <td>105000</td>
                                        </tr>
                                        <tr>
                                            <td colspan="1"></td>
                                            <td style="font-weight:bold;">Sub Total</td>
                                            <td style="font-weight:bold;">105000</td>
                                        </tr>
                                        <tr>
                                            <td colspan="1"></td>
                                            <td>Berat Produk</td>
                                            <td>800 Gram</td>
                                        </tr>
                                        <tr>
                                            <td colspan="1"></td>
                                            <td>Biaya Kirim</td>
                                            <td>10000</td>
                                        </tr>
                                        <tr>
                                            <td colspan="1"></td>
                                            <td style="font-weight:bold;">Total</td>
                                            <td style="font-weight:bold;">115000</td>
                                        </tr>
                                    </tbody>
                                </table>
                                <div class="btn-pembayaran">
                                    <button type="button" class="btn btn-secondary btn-lg">
                                        <a href="#modalPembayaran" data-toggle="modal" style="color: #fff;">PEMBAYARAN
                                        </a>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        <Footer></Footer>

        <div class="modal fade" id="modalPembayaran" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true" style="padding-right: 17px;">
            <div class="modal-dialog modal-sm" role="document">
                <form action="#">
                    <div class="modal-content logbox">
                        <div style="padding-bottom: 15px;">
                            <h6 class="text-center" style="padding-bottom: 15px;">Pembayaran</h6>

                            <p style="font-weight:bold; margin:0;">Date:</p>
                            <input type="date" class="form-control" style="margin: 0 0 10px;">
                            <hr>
                            <p><strong>Method Payment:</strong></p>
                            <div class="form-check form-check-inline">
                                <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1" class="form-check-input" style="height: auto; width: auto;"> 
                                <label for="inlineRadio1" class="form-check-label" style="font-size: 12px;">Transfer</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1" class="form-check-input" style="height: auto; width: auto;"> 
                                <label for="inlineRadio1" class="form-check-label" style="font-size: 12px;">Debit</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1" class="form-check-input" style="height: auto; width: auto;"> 
                                <label for="inlineRadio1" class="form-check-label" style="font-size: 12px;">Credit Card</label>
                            </div>
                        </div>
                        
                        <div class="modal-footer d-flex justify-content-center" style="border-top: none; padding-bottom: 0px;">
                            <a href="#" data-toggle="modal" data-dismiss="modal" class="btn btn-outline-success" style="margin-right: 2px; border-color: rgb(6, 167, 99);">Cancel</a> 
                            <button type="submit" class="btn btn-success" style="margin-left: 2px; background-color: rgb(6, 167, 99);">Submit</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>  
    </div>
      
</template>

<style>
.pesanan-anda{
    background-color: #f2f2f2;
}
.detail-pesanan{
    padding: 30px;
}
.img-header{
    object-fit: cover;
    width:100%;
    height:300px;
    margin-bottom: 5%;
    margin-top: -75px;
}
.informasi{
    font-family: 'Montserrat', sans-serif;
}
.isi-informasi li{
    list-style: none;
}
.isi-informasi {
    border: 1px solid #5d5d5d;
    font-family: 'Montserrat', sans-serif;
}
.isi-informasi ul{
    margin-left: 5px;
}
.btn-pembayaran {
    margin-top: 35px;
}
.btn-secondary {
    width: 100%;
    border-radius: 0 !important;
}
.informasi-tambahan{
    font-family: 'Montserrat', sans-serif;
}
</style>



<script>
import Header2 from "@/components/Header2.vue"
import Footer from "@/components/Footer.vue"

export default {
    data(){
        return{
            
        }
    },

    components:{
        Header2,
        Footer
    }
}
</script>

