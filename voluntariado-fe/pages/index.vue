<template>
  <div>
    <b-container class="fluid">
      <v-row>
        <v-col cols="12">
          <v-card class="text-center">
            <h1>Habilidades disponibles - RESUMEN</h1>
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
import { Icon } from 'leaflet';

delete Icon.Default.prototype._getIconUrl;
Icon.Default.mergeOptions({
  iconRetinaUrl: require('leaflet/dist/images/marker-icon-2x.png'),
  iconUrl: require('leaflet/dist/images/marker-icon.png'),
  shadowUrl: require('leaflet/dist/images/marker-shadow.png'),
});
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
        { value: null, text: "Seleccione una regi??n" },
<<<<<<< Updated upstream
        { value: 6, text: "Regi??n del Libertador Bernardo O'Higgins" },
        { value: "10", text: "Regi??n de Los Lagos" },
        { value: "3", text: "Regi??n de Atacama" },
        { value: "13", text: "Regi??n Metropolitana de Santiago" },
=======
        { value: "2", text: "Regi??n del Libertador Bernardo O'Higgins" },
        { value: "4", text: "Regi??n de Los Lagos" },
        { value: "4", text: "Regi??n de Atacama" },
        { value: "5", text: "Regi??n Metropolitana de Santiago" },
        { value: "11", text: "Regi??n de Aysen del Gral.Iba??ez del Campo" },
>>>>>>> Stashed changes
        { value: "9", text: "Regi??n de La Araucan??a" },
        { value: "7", text: "Regi??n del Maule" },
        { value: "5", text: "Region de Valpara??so" },
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
          console.log(response.data)
        })
        .catch((error) => {
          console.log(error);
        });
    },
  },
};
</script>
