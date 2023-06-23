import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-busqueda__administrador_')
export class VistaBusqueda__administrador_ extends LitElement {
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
 <vaadin-vertical-layout style="height: 5%; width: 100%;">
  <div id="divCabecera" style="width: 100%; height: 100%;"></div>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout style="width: 100%; height: 100%;">
  <vaadin-vertical-layout style="width: 70%; height: 100%;">
   <vaadin-vertical-layout style="width: 100%; height: 50%;">
    <vaadin-horizontal-layout style="width: 100%; height: 10%; align-items: center; justify-content: center;">
     <label>Usuarios recientes</label>
    </vaadin-horizontal-layout>
    <div id="divUsuarios" style="height: 90%; width: 100%;"></div>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 50%;">
    <vaadin-horizontal-layout style="width: 100%; height: 10%; align-items: center; justify-content: center;">
     <label>Videos recientes </label>
    </vaadin-horizontal-layout>
    <div id="divVideos" style="width: 100%; height: 90%;"></div>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 30%; flex-shrink: 0; align-items: center; justify-content: flex-start;" theme="spacing">
   <vaadin-text-field style="margin-top: var(--lumo-space-xl); width: 60%;" id="tfIn"></vaadin-text-field>
   <vaadin-button style="width: 60%;" id="bBuscarUsuario">
     Buscar Usuario 
   </vaadin-button>
   <vaadin-button style="width: 60%;" id="bBuscarHashtag">
     Buscar Hashtag 
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
