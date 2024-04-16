<template>
    <ion-page>
      <ion-header>
        <ion-toolbar>
          <ion-title>Lista de Categorías</ion-title>
        </ion-toolbar>
      </ion-header>
      <ion-content>
        <ion-list>
          <ion-item v-for="category in categories" :key="category.id">
            <ion-label>{{ category.name }}</ion-label>
            <ion-label slot="end">{{ category.description }}</ion-label>
          </ion-item>
        </ion-list>
      </ion-content>
    </ion-page>
  </template>
  
  <script>
  export default {
    data() {
      return {
        categories: [] // Aquí deberías tener una lista de categorías
      };
    },
    mounted() {
      // Lógica para cargar las categorías desde la API
      // axios.get('URL_DE_TU_API/categorias').then(response => {
      //   this.categories = response.data;
      // });
    }
  };
  </script>
  