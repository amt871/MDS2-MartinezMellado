import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-buscar__no_registrado_')
export class VistaBuscar__no_registrado_ extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: absolute;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 5%;">
  <div id="divCabecera" style="width: 100%; height: 100%;"></div>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout style="width: 100%; height: 95%; padding-top: var(--lumo-space-m);">
  <vaadin-vertical-layout style="width: 70%; height: 100%; justify-content: flex-start; align-items: center;">
   <vaadin-vertical-layout style="width: 100%; height: 50%; align-items: center; flex-wrap: wrap;">
    <vaadin-horizontal-layout style="width: 100%; height: 10%; align-items: center; justify-content: center;">
     <label theme="spacing">Usuarios recientes</label>
    </vaadin-horizontal-layout>
    <div id="divUsuarios" style="width: 100%; height: 90%;"></div>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 50%;">
    <vaadin-horizontal-layout style="width: 100%; height: 10%; align-items: center; justify-content: center;">
     <label>Videos mas recientes</label>
    </vaadin-horizontal-layout>
    <div id="divVideos" style="width: 100%; height: 90%;"></div>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 30%; height: 100%; align-items: center; justify-content: flex-start;">
   <vaadin-text-field id="inTextField"></vaadin-text-field>
   <vaadin-button id="bBuscarUsuario">
     Buscar usuario 
   </vaadin-button>
   <vaadin-button id="bBUscarHastag">
     Buscar Hastag 
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
