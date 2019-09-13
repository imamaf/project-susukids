<template>
    <div>
        <q-header elevated  class="bg-black" >
            <q-toolbar>
                <q-btn
                flat
                dense
                round
                @click="leftDrawerOpen = !leftDrawerOpen"
                aria-label="Menu"
                icon="menu"
                style="margin-left: 20px;"/>

                <q-toolbar-title>
                    Administrator
                </q-toolbar-title>

                <div></div>
            </q-toolbar>
        </q-header>

        <q-drawer
            v-model="leftDrawerOpen"
            bordered
            content-class="bg-grey-2">
            <q-list style="padding: 20px;">
                <q-item-label header>
                    <a class="navbar-brand">
                        <h1>susu 
                            <span>kids.com</span>
                        </h1>
                    </a>
                </q-item-label>
                <q-item clickable tag="a" href="/#/mainowner">
                    <q-item-section avatar>
                        <q-icon name="dashboard" />
                    </q-item-section>
                    <q-item-section>
                        <q-item-label>Dashboard</q-item-label>
                    </q-item-section>
                </q-item>

                <q-item clickable tag="a" href="/#/tarikdatasales">
                    <q-item-section avatar>
                        <i class="fas fa-file-download" style="font-size:20px;"></i>
                    </q-item-section>
                    <q-item-section>
                        <q-item-label>Tarik Data Sales</q-item-label>
                    </q-item-section>
                </q-item>

                <q-item clickable tag="a"  @click="logout()">
                    <q-item-section avatar>
                        <q-icon name="exit_to_app" />
                    </q-item-section>
                    <q-item-section>
                        <q-item-label>Logout</q-item-label>
                    </q-item-section>
                </q-item>
            </q-list>
        </q-drawer>
    </div>
</template>

<style>
div{
    font-family: 'Montserrat',sans-serif;
}
</style>


<script>
export default {
  data () {
    return {
      leftDrawerOpen: !this.$q.platform.is.desktop
    }
  },

  methods:{
    logout(){
      this.$ls.remove("userNow")
      this.$router.push("/")
    }
  }
}
</script>
