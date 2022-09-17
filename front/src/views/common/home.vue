<template>
  <div>
    <img src="~@/assets/img/home_bg.png" width="100%" :height="height" />
  </div>
</template>``

<script>
  export default {
    data () {
      return {
        height: this.$store.state.common.documentClientHeight + 'px'
      }
    },
    created () {
      this.height = '100%'
    },
    mounted () {
      console.log(this.$store.state.common.documentClientHeight)
    }
  }
</script>

