import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cabecera__administrador_';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

@customElement('vista-vista_detalle__administrador_')
export class VistaVista_detalle__administrador_ extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: flex-start;">
 <vista-cabecera__administrador_ style="width: 100%; align-self: center; flex-grow: 0; flex-shrink: 1; height: 5%;"></vista-cabecera__administrador_>
 <vaadin-vertical-layout style="height: 100%; width: 100%; flex-direction: row; align-items: flex-start; justify-content: flex-start;">
  <img style="height: 100%; width: 60%;" src="../../resources/icons/video.png">
  <vaadin-vertical-layout theme="spacing" style="height: 100%; flex-grow: 1; flex-shrink: 0; align-items: center;">
   <iron-icon icon="lumo:user" style="width: 15%; height: 10%;"></iron-icon>
   <label>Usuario de la publicacion </label>
   <vaadin-horizontal-layout theme="spacing">
    <label>Fecha </label>
    <label>Ubicacion</label>
   </vaadin-horizontal-layout>
   <label>Descripcion </label>
   <vaadin-text-area style="width: 80%; height: 50%;"></vaadin-text-area>
   <vaadin-horizontal-layout style="align-items: flex-start; width: 90%; justify-content: space-around; flex-grow: 0; align-self: center;">
    <vaadin-vertical-layout theme="spacing" style="align-items: stretch; justify-content: center;">
     <iron-icon style="align-self: center;" icon="vaadin:heart"></iron-icon>
     <label>Me gustas</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing">
     <iron-icon style="align-self: center;" icon="vaadin:comments"></iron-icon>
     <label style="align-self: center;">Comentarios</label>
     <vaadin-button>
      Ver comentarios
     </vaadin-button>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-button style="align-self: flex-end; margin-right: 5%; margin-top: 5%; width: 30%; height: 5%;">
    Eliminar 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
