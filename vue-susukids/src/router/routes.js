import Katalog from '@/components/Katalog.vue';
import Keranjang from '@/components/Keranjang.vue';
import DetailProduk from '@/components/DetailProduk.vue';
import Dashboard from '@/admin/Dashboard.vue';
import Customers from '@/admin/Customers.vue';
import MainMenu from '@/admin/MainMenu.vue';
import Transaksi from '@/admin/Transaksi.vue';
import Login from '@/components/Login.vue';
import DataBarang from '@/admin/DataBarang.vue';
import DataPemesanan from '@/components/DataPemesanan.vue';
import HistoryTransaksi from '@/components/HistoryTransaksi.vue';
import MainOwner from '@/owner/MainOwner.vue';
import Register from '@/components/Register.vue';
import Artikel from '@/components/Artikel.vue';



const routes = [
    { path: '/', component: Katalog, name:'katalog'},
    { path: '/keranjang', component: Keranjang, name:'keranjang'},
    { path: '/detailproduk', component: DetailProduk, name: 'detailproduk'},
    { path: '/dashboard', component: Dashboard, name: 'dashboard'},
    { path: '/customers', component: Customers, name: 'customers'},
    { path: '/mainmenu', component: MainMenu, name: 'mainmenu'},
    { path: '/transaksi', component: Transaksi, name: 'transaksi'},
    { path: '/databarang', component: DataBarang, name: 'databarang'},
    { path: '/datapemesanan', component: DataPemesanan, name: 'datapemesanan'},
    { path: '/historytransaksi', component: HistoryTransaksi, name: 'historytransaksi'},
    { path: '/mainowner', component: MainOwner, name: 'mainowner'},
    { path: '/login', component: Login, name: 'login'},
    { path: '/register', component: Register, name: 'register'},
    { path: '/artikel', component: Artikel, name: 'artikel'}
];

export default routes;