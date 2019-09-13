<template>
    <div>
        <Header2></Header2>
        <div style="width: 100%;">
            <img src="../assets/banner-cart-2.jpg" alt class="img-fluid img-header">
        </div>
        <div class="container" style="width:auto;">
            <div class="row">
                <div class="col-md-12 title">
                    <h5>Keranjang Belanja</h5>
                </div>
                <div class="table-content table-responsive">
                    <table class="table">
                        <thead>
                            <tr>
                                <th>remove</th>
                                <th>images</th>
                                <th>Produk</th>
                                <th>Quantity</th>
                                <th>Total</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>test</td>
                                <td><a href=""> <img src="../assets/bebelac.png" alt width="100" height="100"></a></td>
                                <td class="product-name text-left">Bebelac 4 Bebenutri Plus Susu Pertumbuhan Madu 800 gr</td>
                                <td>
                                    <a href="#" class="btn btn-outline-danger">-</a>
                                    2
                                    <a href="#" class="btn btn-outline-success">+</a>
                                </td>
                                <td class="product-subtotal">Rp. 300.000</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>

            <div class="row">
                <div class="col-md-6 ml-auto">
                    <div class="cart-page-total">
                        <h2>Pengiriman</h2>
                    </div>
                    <div>
                        <input type="email" placeholder="Email" name="email" class="nice-input">
                        <input type="text" placeholder="Penerima" name="penerima" class="nice-input">
                        <input type="text" placeholder="No.Telepon" name="noTelepon" class="nice-input">
                        <input type="text" placeholder="Alamat" name="alamat" class="nice-input">
                        <div class="row col-md-12" style="margin: 0px; padding: 0px;">
                            <div class="col-md-6" style="padding:0px;">
                                <select name="provinsi" class="nice-select">
                                    <option value>Pilih Provinsi</option>
                                </select>
                            </div>
                            <div class="col-md-6" style="padding:0px;">
                                <select name="provinsi" class="nice-select">
                                    <option value>Pilih Kabupaten</option>
                                </select>
                            </div>
                            <div class="col-md-6" style="padding:0px;">
                                <select name="provinsi" class="nice-select">
                                    <option value>Pilih Kecamatan</option>
                                </select>
                            </div>
                            <div class="col-md-6" style="padding:0px;">
                                <select name="provinsi" class="nice-select">
                                    <option value>Pilih Kelurahan</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-5 ml-auto">
                    <div class="cart-page-total">
                        <h2>Total Keranjang</h2>
                        <br>
                        <ul>
                            <li>Subtotal <span>Rp. 660.000</span></li> 
                            <li><small>Berat Barang / Kirim</small><span><small>0.156 / 1Kg</small></span></li> 
                            <li><small>Biaya Kirim</small><span><small>71.000</small></span></li> 
                            <li>Total <span>707.800</span></li>
                        </ul>
                        <a href="/" class="col-12 col-md-5 float-left d-flex justify-content-center">Kembali Belanja</a>
                        <a href="#/datapemesanan" type="submit" class="col-12 col-md-5 float-right d-flex justify-content-center button-custom">Checkout</a>
                    </div>
                </div>
            </div>
        </div>
        <Footer></Footer>
    </div>
    
</template>

<style>
template{
    font-family: 'Montserrat',sans-serif;
}
.img-header{
    object-fit: cover;
    width: 100%;
    height: 300px;
    margin-bottom: 5%;
    margin-top: -75px;
}
.title h5{
    font-family: 'Montserrat',sans-serif;
}
.table-content table {
    background: #fff none repeat scroll 0 0;
    border-color: #ebebeb;
    border-radius: 0;
    border-style: solid;
    border-width: 1px 0 0 1px;
    text-align: center;
    width: 100%;
    margin-bottom: 0;
    font-family: 'Montserrat',sans-serif;
}
thead {
    background-color: #f6f6f6;
}
.table-content table th {
    border-top: medium none;
    font-size: 15px;
    text-transform: capitalize;
    padding: 20px 10px;
    text-align: center;
    font-weight: 500;
    vertical-align: middle;
    white-space: nowrap;
    font-family: 'Montserrat',sans-serif;
}
.table-content table th, .table-content table td {
    border-bottom: 1px solid #ebebeb;
    border-right: 1px solid #ebebeb;
}
.table-content table td {
    border-top: medium none;
    vertical-align: middle;
    font-size: 13px;
}
.table-content table td.product-name {
    font-size: 14px;
    font-weight: 500;
    text-transform: capitalize;
    font-family: 'Montserrat',sans-serif;
}
.table-content table td.product-subtotal {
    font-size: 16px;
    font-weight: 700;
    font-family: 'Montserrat',sans-serif;
    color: #414141;
}
.cart-page-total {
    padding-top: 50px;
}
.cart-page-total h2 {
    font-size: 25px;
    font-weight: 700;
    margin-bottom: 20px;
    text-transform: capitalize;
    font-family: 'Montserrat',sans-serif;
}
.cart-page-total ul {
    border: 1px solid #ddd;
}
.cart-page-total ul li {
    list-style: none;
    font-size: 15px;
    color: #252525;
    padding: 10px 30px;
    border-bottom: 1px solid #ebebeb;
    font-weight: 700;
    font-family: 'Montserrat',sans-serif;
}
.cart-page-total ul li span {
    float: right;
}
ul{
    margin: 0;
    padding: 0;
}
.cart-page-total a {
    background-color: #333;
    border: 1px solid #333;
    color: #fff;
    margin-top: 30px;
    padding: 10px 20px;
    text-transform: capitalize;
    transition: all 0.3s ease 0s;
    font-family: 'Montserrat',sans-serif;
}
.button-custom {
    background-color: #333;
    border: 1px solid #333;
    color: #fff;
    display: inline-block;
    margin-top: 30px;
    padding: 10px 20px;
    text-transform: capitalize;
    -webkit-transition: all 0.3s ease 0s;
    transition: all 0.3s ease 0s;
    height: 45px;
    font-family: 'Montserrat',sans-serif;
}
.nice-input {
    background-color: #fff;
    border-width: 0;
    border-bottom: solid 1px #ff5b5b;
    box-sizing: border-box;
    clear: both;
    cursor: pointer;
    display: block;
    float: left;
    height: 42px;
    line-height: 40px;
    outline: none;
    padding-left: 18px;
    padding-right: 30px;
    position: relative;
    text-align: left !important;
    white-space: nowrap;
    width: 100%;
}
.nice-select {
    -webkit-tap-highlight-color: transparent;
    background-color: #fff;
    border-bottom: solid 1px #ff5b5b!important;
    box-sizing: border-box;
    /* clear: both; */
    cursor: pointer;
    display: block;
    float: left;
    height: 42px;
    line-height: 40px;
    outline: none;
    padding-left: 18px;
    padding-right: 30px;
    position: relative;
    text-align: left !important;
    -webkit-transition: all 0.2s ease-in-out;
    transition: all 0.2s ease-in-out;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    user-select: none;
    white-space: nowrap;
    width: 100%;
    border-radius: 0px;
    border: solid 0px #e8e8e8;
    font-family: inherit;
    font-size: 14px;
    font-weight: normal;
}
option {
    background: #fff;
    border: 0px solid #626262;
    padding-left: 10px;
    font-size: 14px;
}
</style>

<script>
import Header2 from "@/components/Header2.vue"
import Footer from "@/components/Footer.vue"

export default {
    data() {
        return {

        }
    },

    components: {
        Header2,
        Footer
    }
}
</script>