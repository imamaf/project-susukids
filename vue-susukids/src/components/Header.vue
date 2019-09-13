<template>
    <div>
        <div class="header-area">
            {{userNoww}}
            <nav class="navbar navbar-expand-lg navbar-light fixed-top">
                <div class="container">
                    <a class="navbar-brand page-scroll" href="/">
                        <h1>susu 
                            <span>kids.com</span>
                        </h1>
                    </a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                        <i class="fas fa-sliders-h"></i>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                        <div class="navbar-nav ml-auto smooth-scroll">
                            <a href="#/" class="nav-item nav-link title-header active">Home</a>
                            <div class="nav-item dropdown">
                                <a class="nav-link title-header dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Kategori
                                </a>
                                <div class="dropdown-menu dropdown-menu3">
                                    <a class="dropdown-item" href="#">0 - 6 Bulan</a>
                                    <a class="dropdown-item" href="#">6 - 12 Bulan</a>
                                    <a class="dropdown-item" href="#">1 - 3 Tahun</a>
                                    <a class="dropdown-item" href="#">3 - 6 Tahun</a>
                                    <a class="dropdown-item" href="#">Dewasa</a>
                                    <a class="dropdown-item" href="#">Ibu Hamil & Menyusui</a>
                                </div>
                            </div>
                            <a href="#/artikel" class="nav-item nav-link title-header page-scroll">Artikel</a>
                            <a href="#" class="nav-item nav-link title-header page-scroll">Tentang</a>
                            <div class="nav-item dropdown">
                                <a class="nav-link title-header dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Login
                                </a>
                                <div class="dropdown-menu drop-login" aria-labelledby="navbarDropdown">
                                    <form @submit="onSubmit" @reset="onReset" class="form-desc" style="padding: 20px; margin-top: 10px;">
                                        <h5>Sign in</h5>
                                        <div class="form-group">
                                            <input v-model="email" type="email" class="form-control" placeholder="Enter email">
                                        </div>
                                        <div class="form-group">
                                            <input v-model="password" type="password" class="form-control" placeholder="Password">
                                        </div>
                                        <div>
                                            <q-btn label="Login" type="submit" color="black" style="display: flex;justify-content: center;" class="text-center"/>
                                        </div>
                                        <br>
                                        <p>Belum memiliki akun? <a href="#/register">Sign up</a></p>
                                    </form>
                                </div>
                            </div>
                            <a href="#" class="nav-item nav-link title-header page-scroll"><i class="fas fa-shopping-bag" style="font-size:23px; margin-left:-20px; margin-top:-20px;"></i></a>
                        </div>
                    </div>
                </div>
            </nav>
        </div>
    </div>
</template>

<style>

.navbar-header{
    /* background-color: #74b9ff; */
    z-index: 1;
}
.navbar-brand h1{
    color: #EAA103;
    padding: 0;
    margin: 0;
    font-size: 35px;
    font-weight: bold;
    line-height: 1;
    font-family: 'Roboto', '-apple-system', 'Helvetica Neue', Helvetica, Arial, sans-serif
}
.navbar-brand h1 span {
    color: rgb(224, 42, 42);
    margin-left: -7px;
}
.title-header{
    text-transform: uppercase;
    margin-right: 30px;
    color: #000000 !important;
    font-weight: bold;
    text-shadow: 1px 1px 1px 1px rgba(0, 0, 0, 0.7);
    font-family: 'Montserrat',sans-serif;
}
.title-header:hover::after {
    content: '';
    display: block;
    border-bottom: 2px solid #ffc107;
    width: 100%;
    margin: auto;
    padding-bottom: 5px;
    margin-bottom: -8px;
}
.text{
    color: #fff;
}
.brand{
    font-size: 30px;
    font-weight: bold;
    color: #ffc107 !important;
}
.dropdown-toggle::after{
    border-top: none;
}
.drop-login{
    width: 300px;
    height: 330px;
    margin: 0 -100px 0;
    color: #5d5d5d;
    font-size: 14px;
    border-radius: 0;
    background-color: #ffffffb8;
    font-family: 'Montserrat',sans-serif;
}
.form-desc p{
    font-size: 13px;
    margin-top: 13px;
    font-style: italic;
    color: #5d5d5d;
}
.form-desc p a{
    margin-left: 5px;
    font-style: normal;
    border-bottom: 1px solid blue;
}
.btn-login{
    margin: 0 auto;
    margin-top: 30px;
    margin-left: 50px;
    margin-right: 50px;
    display: block;
    font-size: 14px;
    color: #fff;
    background: #EAA103;
    align-items: center;
    border-radius: 5px;
}
.form-group .form-control {
    border-radius:0;
    border: none;
    background-color: transparent!important;
    border-bottom: 1px solid #ffffff;
    width: 100%;
    height: 50px;
    display: block;
    margin: 0 auto 0px;
    font-size: 13px;
    padding: 0 15px;
    color: #ffffff;
    -webkit-input-placeholder: #fff !important;
}
.dropdown-menu3{
    width: auto;
    height: auto;
    margin: 0 -100px 0;
    color: #fff;
    font-size: 14px;
    border-radius: 0;
    background-color: #1f1f1fb8;
    font-family: 'Montserrat',sans-serif;
}
.dropdown-menu3 a{
    color: #fff;
}
</style>

<script>
import login_api from '../api/login/index';

//import component
export default {
  

  data() {
    return {
      email: "",
      password: "",
      userNow:"",
    };
  },

  computed:{
    userNoww(){
            this.$ls.get("userNow");

    }
  },

  methods:{

    onSubmit() {
      let self = this;

      let credentials = {
        email : self.email,
        password : self.password
      }

      console.log(credentials)

      login_api
        .loginUser(credentials, window)
        .then(function(result) {

          if (!result) {
            
          } else {
            
            self.$ls.set("userNow", result.id);
            console.log("id nya dia = ", self.$ls.get("userNow"))
            self.$router.push("/keranjang");
          }
          return result;
        })
        .catch(function(err) {
          console.log(err);
        });
    },

    onReset() {
      this.email = null;
      this.password = null;
    }
  }
}

</script>