<template>
    <div>
        <div id="content-wrapper">
            <div class="container-fluid header-cust" style="padding: 20px;">
                <div class="row">
                    <div class="col-md-6">
                        <h5>Data Users</h5>
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
                    <table class="table table-striped table-bordered" id="dataTable" width="100%" cellspacing="0">
                        <thead style="background-color: #f6f6f6;">
                            <tr>
                                <th>USERNAME</th>
                                <th>EMAIL</th>
                                <th>ALAMAT</th>
                                <th>NO.TELEPON</th>
                                <th>STATUS</th>
                                <th class="text-center">#</th>
                            </tr>
                        </thead>
                        
                        <tbody>
                            <tr v-for="user in users" :key="user.id">
                                <td>{{ user.nama_lengkap }}</td>
                                <td>{{ user.email }}</td>
                                <td>{{ user.alamat }}</td>
                                <td>{{ user.no_telepon }}</td>
                                <td>{{ user.role }}</td>
                                <td class="text-center">
                                    <a href="#modalCustomer" data-toggle="modal" v-on:click="edit"><i class="far fa-edit"></i></a>
                                    |
                                    <a href="#"><i class="far fa-trash-alt"></i></a>
                                </td>
                            </tr>
                            
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <div class="modal fade" id="modalCustomer" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true" style="padding-right: 17px;">
            <div class="modal-dialog modal-sm" role="document">
                <form action="#">
                    <div class="modal-content logbox">
                        <div style="padding-bottom: 15px;">
                            <h6 class="text-center" style="padding-bottom: 15px;">Edit Data Customers</h6>
                            <p style="font-weight:bold; margin:0;">Username:</p>
                            <input type="text" class="form-control" style="margin: 0 0 10px;">
                            
                            <p style="font-weight:bold; margin:0;">Email:</p>
                            <input type="email" class="form-control" style="margin: 0 0 10px;">

                            <p style="font-weight:bold; margin:0;">Alamat:</p>
                            <input type="text" class="form-control" style="margin: 0 0 10px;">

                            <p style="font-weight:bold; margin:0;">No.Telepon:</p>
                            <input type="text" class="form-control" style="margin: 0 0 10px;">
                        </div>
                        
                        <div class="modal-footer d-flex justify-content-center" style="padding-bottom: 0px;">
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
.form-group .form-control {
    width: auto;
    display: initial;
    height: calc(1.6em + .75rem + 2px);
    padding: .375rem .75rem;
    font-size: .9rem;
    font-weight: 400;
    line-height: 1.6;
    color: #495057;
    margin: 0 5px 0;
    background-color: #fff;
    background-clip: padding-box;
    border: 1px solid #ced4da;
    border-radius: 0;
    transition: border-color .15s ease-in-out,box-shadow .15s ease-in-out;
}
.float-right {
    float: right!important;
}
.form-inline {
    display: flex;
    flex-flow: row wrap;
    align-items: center;
}
.form-inline .form-control {
    display: inline-block;
    width: auto;
    vertical-align: middle;
}
.input-with-button input {
    border-top-right-radius: 0;
    border-bottom-right-radius: 0;
}
.btn-search{
    display: inline-block;
    font-weight: 400;
    color: #212529;
    text-align: center;
    vertical-align: middle;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    user-select: none;
    background-color: transparent;
    border: 1px solid transparent;
    padding: .375rem .75rem;
    font-size: .9rem;
    line-height: 1.6;
    height: 36px;
    outline: 0;
    border-radius: .25rem;
    transition: color .15s ease-in-out,background-color .15s ease-in-out,border-color .15s ease-in-out,box-shadow .15s ease-in-out;
    box-shadow: 0 2px 5px 0 rgba(0, 0, 0, .16), 0 2px 10px 0 rgba(0, 0, 0, .12);
}
.table.table-striped th {
    background: #fff;
}
.logbox {
    padding: 20px;
    padding-top: 35px;
    margin: 100px auto;
    width: 365px;
    background-color: #fff;
    -webkit-box-shadow: 0 1px 5px rgba(0, 0, 0, 0.25);
    -moz-box-shadow: 0 1px 5px rgba(0, 0, 0, 0.25);
    box-shadow: 0 1px 5px rgba(0, 0, 0, 0.25);
    border:none !important;
    border-radius:0 !important;
}
.modal-content {
    position: relative;
    display: flex;
    flex-direction: column;
    width: 100%;
    pointer-events: auto;
    background-color: #fff;
    background-clip: padding-box;
    border: 1px solid rgba(0,0,0,.2);
    border-radius: .3rem;
    outline: 0;
}

</style>

<!--<script>
export default {
    data() {
        return {
            posts: []
        }
    },
    mounted() {
        this.$http.get('http://localhost:8888/api/v3/pengguna/login')
        .then(function(res){
            this.posts = res.body;
        })
        .catch(function(error){
            console.log('Error: ', error);
        })
    }
}
</script>-->

<script>
import axios from 'axios'

export default {
    data() {
        return {
           
            users: []
        }
    },
    methods: {
        load(){
            axios.get('http://localhost:8888/api/v3/pengguna/login')
            .then((res)=>{
                this.users = res.data;
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