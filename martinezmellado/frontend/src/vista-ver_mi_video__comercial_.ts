import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_comercial';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-ver_mi_video__comercial_')
export class VistaVer_mi_video__comercial_ extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vista-cabecera_comercial style="width: 100%; height: 5%;"></vista-cabecera_comercial>
 <vaadin-horizontal-layout style="height: 95%; width: 100%;" theme="spacing">
  <vaadin-vertical-layout style="width: 60%; height: 100%; justify-content: center;">
   <img style="height: 100%;" src="../../resources/icons/video.svg">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 40%; height: 100%; align-items: center; align-self: center;">
   <iron-icon style="align-self: center; width: 25%; height: 25%;" src="../../resources/icons/user.svg"></iron-icon>
   <vaadin-horizontal-layout style="width: 100%; justify-content: center; align-items: center; align-self: center;">
    <vaadin-horizontal-layout style="width: 100%; align-items: center; justify-content: center;">
     <label>Fecha</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout style="width: 100%; align-items: center; justify-content: center;">
     <label style="align-self: center;">Ubicacion</label>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; height: 50%; align-self: center; align-items: center; justify-content: center;">
    <label>Descripcion</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; justify-content: space-around; margin-top: var(--lumo-space-s);">
    <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center; align-self: center;">
     <vaadin-button theme="icon" aria-label="Add new">
      <iron-icon icon="vaadin:comments"></iron-icon>
     </vaadin-button>
     <label>Me gustas</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center;">
     <vaadin-button theme="icon" aria-label="Add new">
      <iron-icon icon="vaadin:heart"></iron-icon>
     </vaadin-button>
     <label>Comentarios</label>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-button style="align-self: flex-end; margin-right: var(--lumo-space-m); margin-top: var(--lumo-space-xl);">
     Eliminar 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
