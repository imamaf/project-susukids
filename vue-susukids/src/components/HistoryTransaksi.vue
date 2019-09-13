<template>
    <div>
        <Header2></Header2>
            <img src="../assets/banner-cart.jpg" alt="Susu Kids" class="img-header">

            <div class="container"> <!--Untuk membuat tampilan tidak full pada layar-->
                <div class="history">
                    <h5 style="margin-bottom:20px;">History Transaksi</h5>
                </div>
                <table class="table table-bordered"> <!--class default dari bootstrapnya-->
                    <thead style="background-color: #f4f4f4;">
                        <tr>
                            <th>Kode Transaksi</th>
                            <th>Tgl Pemesanan</th>
                            <th>Tgl Transaksi</th>
                            <th>Total Harga</th>
                            <th>Pembayaran</th>
                            <th>Status</th>
                            <th>Invoice</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td style="font-weight:bold;">ORBMII</td>
                            <td>2019-09-05</td>
                            <td></td>
                            <td>55000</td>
                            <td>Bank Transfer</td>
                            <td>Pending</td>
                            <td><a href="#">Details</a></td>
                        </tr>
                    </tbody>
                </table>
            </div>
        <Footer></Footer>
    </div>

</template>

<style>

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