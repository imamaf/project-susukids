<template>
    <!-- <q-page>
        <div class="flex flex-center">
        <div class="q-pa-md" style="max-width: 350px; width:100%">
            <q-form @submit="onSubmit" @reset="onReset" class="q-gutter-md">
            <q-input
                filled
                v-model="nama_lengkap"
                label="Nama Lengkap *"
                hint="User Fullname"
                lazy-rules
                :rules="[ val => val && val.length > 0 || 'Please type something']"
            />

            <q-input
                filled
                v-model="email"
                label="Email Address *"
                hint="User Email"
                lazy-rules
                :rules="[ val => val && val.length > 0 || 'Please type something']"
            />

            <q-input
                filled
                type="number"
                v-model="no_telepon"
                label="Phone number *"
                hint="Phone Number"
                lazy-rules
                :rules="[ val => val.length <= 12 || 'Please type maximum 12 number']"
            />

            <q-input
                filled
                v-model="alamat"
                label="Address *"
                hint="User Address"
                lazy-rules
                :rules="[ val => val && val.length > 0 || 'Please type something']"
            />

            <q-input
                filled
                v-model="password"
                label="Password *"
                hint="User Password"
                lazy-rules
                :rules="[ val => val && val.length > 0 || 'Please type something']"
            />

            <q-input
                filled
                v-model="konfirm_password"
                label="Password *"
                hint="User Password"
                lazy-rules
                :rules="[ val => val && val.length > 0 || 'Please type something']"
            />

            <q-toggle v-model="accept" label="I accept the license and terms" />
            <div>
                <q-btn label="Submit" type="submit" color="primary" />
                <q-btn label="Reset" type="reset" color="primary" flat class="q-ml-sm" />
            </div>
            </q-form>
            <br>
            <br>
            <router-link to="/login">
                <center>Already Have an Account?</center>
            </router-link>
            <br>
            <br>
            <br>
            <br>
        </div>
        </div>
    </q-page> -->
    <div>
        <div class="container">
            <div class="main-regist">
                <div class="row">
                    <div class="col-md-7">
                        <img src="../assets/login-img.png" alt="Logo Tekno" style="margin-top:30px;" class="vert-move"/>
                    </div>
                    <div class="col-md-5">
                        <div class="drop-regist">
                            <form @submit="onSubmit" @reset="onReset" class="form-desc" style="padding: 20px; margin-top: 10px;">
                                <h5><strong>Sign up</strong></h5>
                                <div class="form-group">
                                    <input v-model="nama_lengkap" type="text" class="form-control2" placeholder="Nama Lengkap">
                                </div>
                                <div class="form-group">
                                    <input v-model="email" type="email" class="form-control2" placeholder="Email">
                                </div>
                                <div class="form-group">
                                    <input v-model="no_telepon" type="text" class="form-control2" placeholder="No.Telepon">
                                </div>
                                <div class="form-group">
                                    <input v-model="alamat" type="text" class="form-control2" placeholder="Alamat">
                                </div>
                                <div class="form-group">
                                    <input v-model="password" type="password" class="form-control2" placeholder="Password">
                                </div>
                                <div class="form-group">
                                    <input v-model="konfirm_password" type="password" class="form-control2" placeholder="Konfirm Password">
                                </div>
                                <div>
                                    <q-btn label="Signup" type="submit" color="black" style="display: flex;justify-content: center;" class="text-center"/>
                                </div>
                                <br>
                                <p>Sudah memiliki akun? <a href="#/">Sign in</a></p>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<style>
.main-regist{
    margin-top: 50px;
}
.drop-regist{
    width: 350px;
    height: auto;
    margin: 0 -15px 0;
    color: #505050;
    font-size: 14px;
    border-radius: 0;
    background-color: #d0aeda;
    font-family: 'Montserrat',sans-serif;
}
.form-group .form-control2 {
    border-radius:0;
    border: none;
    background-color: transparent!important;
    border-bottom: 1px solid #ffffff;
    width: 100%;
    height: 40px;
    display: block;
    margin: 0 auto 0px;
    font-size: 13px;
    padding: 0 15px;
    color: #ffffff;
    -webkit-input-placeholder: #fff !important;
}

img.vert-move {
    -webkit-animation: mover 1s infinite  alternate;
    animation: mover 1s infinite  alternate;
}
img.vert-move {
    -webkit-animation: mover 1s infinite  alternate;
    animation: mover 1s infinite  alternate;
}
@-webkit-keyframes mover {
    0% { transform: translateY(0); }
    100% { transform: translateY(-10px); }
}
@keyframes mover {
    0% { transform: translateY(0); }
    100% { transform: translateY(-10px); }
}
</style>

<script>
import register from "../api/register/index";
import axios from "axios";
export default {
     name: 'register',

  data() {
    return {
      columns: [
        {
          name: "nama_lengkap",
          required: true,
          label: "nama_lengkap",
          align: "left",
          field: row => row.nama_lengkap,
          format: val => `${val}`,
          sortable: true
        },
        {
          name: "email",
          required: true,
          label: "email",
          align: "left",
          field: row => row.email,
          format: val => `${val}`,
          sortable: true
        },
        {
          name: "no_telepon",
          required: true,
          label: "no_telepon",
          align: "left",
          field: row => row.no_telepon,
          format: val => `${val}`,
          sortable: true
        },
        {
          name: "alamat",
          required: true,
          label: "alamat",
          align: "left",
          field: row => row.alamat,
          format: val => `${val}`,
          sortable: true
        },
        {
          name: "password",
          required: true,
          label: "password",
          align: "left",
          field: row => row.password,
          format: val => `${val}`,
          sortable: true
        },
        {
          name: "konfirm_password",
          required: true,
          label: "konfirm_password",
          align: "left",
          field: row => row.konfirm_password,
          format: val => `${val}`,
          sortable: true
        }
      ],
      nama_lengkap: "",
      email: "",
      no_telepon: "",
      alamat: "",
      password: "",
      konfirm_password: "",
      accept: "true"
    };
  },
  methods: {
    onSubmit() {
        let credentials = {
          nama_lengkap: this.nama_lengkap,
          email: this.email,
          no_telepon: this.no_telepon,
          alamat: this.alamat,
          password: this.password,
          konfirm_password: this.konfirm_password 
        };
        const self = this;
        register
          .registerUser(credentials, window)
          .then(function(result) {
            return result;
          })
          .catch(function(err) {
            console.log(err);
          });
        alert('Sukses')
        self.$router.push("/");
      }
    },

    onReset() {
      this.fullname = null;
      this.email = null;
      this.pass = null;
      this.phone = null;
      this.address = null;
      this.accept = false;
    }

  };
</script>