<template>
    <div>
        <div class="header-area">
            <nav class="navbar navbar-expand-lg navbar-light">
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
                            <a href="#/keranjang" class="nav-item nav-link title-header page-scroll">Kategori</a>
                            <a href="#/artikel" class="nav-item nav-link title-header page-scroll">Artikel</a>
                            <a href="#" class="nav-item nav-link title-header page-scroll">Tentang</a>
                            <div class="nav-item dropdown">
                                <a class="nav-link title-header dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
                                    <i class="far fa-address-card" style="font-size:23px; margin-left:-20px; margin-top:-20px;"></i>
                                </a>
                                <div class="dropdown-menu dropdown-menu2">
                                    <a class="dropdown-item" href="#">
                                        <i class="fas fa-user"></i><span style="margin-left:10px;">USERS</span></a>
                                    <div class="dropdown-divider"></div>
                                    <a class="dropdown-item" href="#">Profil</a>
                                    <a class="dropdown-item" href="#/historytransaksi">Transaksi</a>
                                    <a class="dropdown-item" href="#" v-on:click="logout">Logout</a>
                                </div>
                            </div>
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
.dropdown-menu2{
    width: auto;
    height: 170px;
    margin: 0 -100px 0;
    color: #fff;
    font-size: 14px;
    border-radius: 0;
    background-color: #1f1f1fb8;
    font-family: 'Montserrat',sans-serif;
}
.dropdown-menu2 a{
    color: #fff;
}
.dropdown-divider{
    width: 160px;
    margin: 0.5rem 10px;
}
.dropdown-item{
    padding: 7px 1.5rem;
}

</style>

<script>
export default {
    
    methods: {
        logout(){
        alert('Proses Logout')
        this.$router.push("/")
        }
    },
}
</script>