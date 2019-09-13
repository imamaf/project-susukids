import VueResource from 'vue-resource'
import Vue from 'vue'
import {getApiNoAuth} from './../utils'

Vue.use(VueResource)

export default {
    getProduk (window) {
        return getApiNoAuth().get('Produks')
        .then(function (response){
            console.log(response)
            return response.data
        }).catch(function(err){
            console.log(err)
        })
    },
    submitProduk(window, param){
        return getApiNoAuth().post('Produks', param)
            .then(function (response){
                console.log(response)
                return response.data
            }).catch(function(err){
                console.log(err)
            })
    },
    deleteProduk(window, id){
        return getApiNoAuth().delete('Produks', id)
            .then(function (response){
                console.log(response)
                return response.data
            }).catch(function(err){
                console.log(err)
            })
    },
}