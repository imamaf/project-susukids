import VueResource from 'vue-resource'
import Vue from 'vue'
import {getApiSpringBoot} from '../utils'
 
Vue.use(VueResource)

export default {
    loginUser(credentials, window) {
        let self = this;
        return getApiSpringBoot().get('pengguna/login', credentials)
            .then(function (response){
                console.log(response)
                localStorage.setItem('loginspringboot', response.data.id);
                return response.data;
            
            })
        
    }
    
}