<template>
  <div>
    <b-container class="fluid">
      <v-row>
        <v-col cols="12">
          <v-card class="text-center">
            <h1>Habilidades disponibles - Resumen</h1>
          </v-card>

          <b-container class="fluid container_h5">
            <b-row>
              <b-col cols="8" md="auto">
                <p>Regiones en las cuales existan habilidades disponibles.</p>
              </b-col>
            </b-row>
          </b-container>
          <b-container class="fluid container_region">
            <b-row>
              <b-col cols="8" md="auto">
                <div>
                  <b-form-select
                    v-model="selected"
                    :options="options"
                  ></b-form-select>
                </div>
                <div class="boton">
                  <button
                    type="button"
                    class="btn btn-primary"
                    @click="handleAbilities"
                  >
                    Mostrar
                  </button>
                </div>
              </b-col>
            </b-row>
          </b-container>
          <b-container>
            <l-map style="height: 500px" :zoom="zoom" :center="center">
              <l-tile-layer
                :url="url"
                :attribution="attribution"
              ></l-tile-layer>
              <l-marker
                v-for="marker in markerLatLng"
                :lat-lng="marker"
                :key="marker"
              ></l-marker>
            </l-map>
          </b-container>
        </v-col>
      </v-row>
    </b-container>
  </div>
</template>

<style>
body {
  background-color: #011e33;
}
h1 {
  color: #ffffff;
  font-size: 3rem;
  margin-top: 1rem;
  margin-bottom: 1rem;
}
.container_region {
  display: flex;
  align-items: center;
  justify-content: center;
  margin-top: 0.5rem;
  margin-bottom: 2rem;
}
.container_h5 {
  display: flex;
  align-items: center;
  justify-content: center;
  color: #ffffff;
}
.boton {
  display: flex;
  align-items: center;
  justify-content: center;
  margin-top: 2rem;
  margin-bottom: 0rem;
}
</style>

<script>
import Vue from "vue";
import { LMap, LTileLayer, LMarker } from "vue2-leaflet";
import "leaflet/dist/leaflet.css";
import axios from "axios";

Vue.component("l-map", LMap);
Vue.component("l-tile-layer", LTileLayer);
Vue.component("l-marker", LMarker);

export default {
  components: {
    LMap,
    LTileLayer,
    LMarker,
  },
  data() {
    return {
      url: "https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png",
      attribution:
        '&copy; <a target="_blank" href="http://osm.org/copyright">OpenStreetMap</a> contributors',
      zoom: 5,
      center: [-33.45694, -70.64827],
      markerLatLng: [[-33.45694, -70.64827]],
      selected: null,
      options: [
        { value: null, text: "Seleccione una región" },
        { value: 6, text: "Región del Libertador Bernardo O'Higgins" },
        { value: "10", text: "Región de Los Lagos" },
        { value: "3", text: "Región de Atacama" },
        { value: "13", text: "Región Metropolitana de Santiago" },
        { value: "11", text: "Región de Aysen del Gral.Ibañez del Campo" },
        { value: "9", text: "Región de La Araucanía" },
        { value: "7", text: "Región del Maule" },
        { value: "5", text: "Region de Valparaíso" },
      ],
    };
  },
  methods: {
    handleAbilities() {
      console.log(this.selected);
      axios
        .get("http://localhost:8081/voluntario/habilidades", {
          params: {
            codRegi: this.selected,
          },
        })
        .then((response) => {
          this.markerLatLng=response.data;
        })
        .catch((error) => {
          console.log(error);
        });
    },
  },
};
</script>
