<template>
    <ion-page>
      <ion-header>
        <ion-toolbar>
          <ion-title>Lista de Productos</ion-title>
        </ion-toolbar>
      </ion-header>
      <ion-content>
        <ion-list>
          <ion-item v-for="product in products" :key="product.id">
            <ion-label>{{ product.name }}</ion-label>
            <ion-label slot="end">{{ product.price }}</ion-label>
          </ion-item>
        </ion-list>
      </ion-content>
    </ion-page>
  </template>
  
  <script>
  export default {
    data() {
      return {
        products: [] // Aquí deberías tener una lista de productos
      };
    },
    mounted() {
      // Lógica para cargar los productos desde la API
      // Por ejemplo, usando Axios para hacer una solicitud HTTP
      // axios.get('URL_DE_TU_API/productos').then(response => {
      //   this.products = response.data;
      // });
    }
  };
  </script>
  