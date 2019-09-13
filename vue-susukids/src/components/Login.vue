<template>

    <div class="flex flex-center">
      {{userNoww}}
      <div class="q-pa-md" style="max-width: 350px; width:100%;text-align:center;">
        <q-form @submit="onSubmit" @reset="onReset" class="q-gutter-md">
          
           
          
          <q-input
            filled
            v-model="email"
            label="Username *"
            hint="Your Username"
            lazy-rules
            :rules="[ val => val && val.length > 0 || 'Please type something']"
          />

          <q-input
            filled
            v-model="password"
            label="Password *"
            hint="Your Password"
            type="password"
            lazy-rules
            :rules="[ val => val && val.length > 0 || 'Please type something']"
          />

          <div>
            <q-btn label="Login" type="submit" color="black" />
            <q-btn label="Reset" type="reset" color="black" flat class="q-ml-sm" />
          </div>
        </q-form>
      </div>

      <div>
      </div>
    </div>
</template>

<style>
  .q-field__control{
    color: black !important;
  }
</style>

<script>
//import dev
import login_api from '../api/login/index';

//import component
export default {
  name: 'login',

  data() {
    return {
      userNow:"",
      email: "",
      password: ""
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
        .loginUser(credentials, self.password)
        .then(function(result) {
          console.log(result)
          if (!result) {
            
           
          } else {
            
            
            self.$ls.set("userNow", result.nama_lengkap);
            console.log("id nya dia = ", self.$ls.get("userNow"))
            self.$router.push("/");
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
