<template>
  <q-layout view="lHh Lpr lFf">
    <q-page-container>
      <headerz v-if="['mainmenu', 'customers', 'transaksi', 'databarang'].indexOf($route.name) > -1"/>
      <headery v-if="['mainowner', 'tarikdatasales'].indexOf($route.name) > -1"/>
      <header v-if="['login'].indexOf($route.name) > -1"/>
      <router-view />
    </q-page-container>
  </q-layout>
</template>

<script>
import Headerz from "@/admin/Headerz.vue"
import Headery from "@/owner/Headery.vue"


export default {

  components: {
    Headerz,
    Headery
  },

  data () {
    return {
      leftDrawerOpen: !this.$q.platform.is.desktop
    }
  }
}
</script>

<style>
</style>

<!--
// <script>
// import HelloWorld from './components/HelloWorld.vue'

// export default {
//   name: 'LayoutDefault',

//   components: {
//     HelloWorld
//   },

//   data () {
//     return {
//       leftDrawerOpen: this.$q.platform.is.desktop
//     }
//   }
// }
// </script>

// <style>
// </style>
