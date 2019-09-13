import axios from 'axios'

const API_URL = 'http://localhost:3000/api/';
const API2 = 'http://localhost:8888/api/v3/';

export function getApiNoAuth(){
    return axios.create({
        baseURL: API_URL,
        timeout: 10000,
        withCredentials: true,
        headers: {
            'Access-Control-Allow-Origin': '*',
            'COntent-Type': 'application/json'
        }
    })
}

export function getApiSpringBoot(){
    return axios.create({
        baseURL: API2,
        timeout: 10000,
        withCredentials: false,
        headers: {
            'Access-Control-Allow-Origin': '*',
            'COntent-Type': 'application/json'
        }
    })
}

export function getApi2 (token, params) {
    if (params) { params.access_token = token } else {
        params = {
            access_token: token
        }
    }
    return axios.create({
        baseURL : API2_URL,
        timeout : 100000,
        withCredentials: true,
        headers: {
            'Access-Control-Allow-Origin': '*',
            'Content-Type': 'aplication/json; charset=utf-8'
        }
    })
}
