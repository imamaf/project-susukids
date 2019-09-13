<template>
    <div>
        <div class="container-fluid header-cust" style="padding: 20px;">
            <div class="row">
                <div class="col-md-6">
                    <h5>Data Barang</h5>
                </div>
                <div class="col-md-6">
                    <div class="form-group float-right">
                        <div class="input-with-button">
                            <input type="text" placeholder="Search.." name="keyword" value="" class="form-control"> 
                            <button class="btn-search" style="background-color: rgb(48, 151, 209);">
                                <i class="fa fa-search" style="color: rgb(255, 255, 255);"></i>
                            </button>
                        </div>
                    </div>
                </div>
            </div>
            <hr style="margin-top: -20px;">

            <div class="table-responsive">
                <table class="table table-bordered table-striped">
                    <thead style="background-color: #f6f6f6;">
                        <tr>
                            <th>NAMA BARANG</th>
                            <th>NAMA KATEGORI</th>
                            <th>KATEGORI</th>
                            <th>STOK</th>
                            <th>HARGA</th>
                            <th class="text-center">#</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr v-for="product in products" :key="product.id">
                            <td>{{ product.merk }}</td>
                            <td>{{ product.nama_kategori }}</td>
                            <td>{{ product.kategori }}</td>
                            <td>{{ product.stok }}</td>
                            <td>{{ product.price }}</td>
                            <td class="text-center">
                                <a href="#"><i class="far fa-edit"></i></a>
                                |
                                <a href="#"><i class="far fa-trash-alt"></i></a>
                            </td>
                        </tr>
                        
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</template>

<style>

</style>


<script>
import axios from 'axios'

export default {
    data() {
        return {
           
            products: []
        }
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