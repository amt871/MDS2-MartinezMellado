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
 <vaadin-horizontal-layout style="height: 95%; width: 100%;">
  <vaadin-vertical-layout style="width: 60%; height: 100%; align-items: center; justify-content: center;">
   <img style="align-self: center;" src="../../resources/icons/video.svg">
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
   <vaadin-button style="align-self: flex-end; margin-right: var(--lumo-space-m);">
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
