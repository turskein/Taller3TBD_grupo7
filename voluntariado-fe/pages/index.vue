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
</style>

<script>
import Vue from "vue";
import { LMap, LTileLayer, LMarker } from "vue2-leaflet";
import "leaflet/dist/leaflet.css";

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
      zoom: 10,
      center: [40.505, -0.159],
      markerLatLng: [[40.504, -0.159], [40.506, -0.17]],
      selected: null,
      options: [
        { value: null, text: "Seleccione una región" },
        { value: "region1", text: "Region1" },
        { value: "region2", text: "Region2" },
        { value: "region2", text: "Region3" },
      ],
    };
  },
};
</script>
