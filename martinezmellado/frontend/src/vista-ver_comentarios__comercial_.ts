import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-comentario__comercial_';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-cabecera_comercial';

@customElement('vista-ver_comentarios__comercial_')
export class VistaVer_comentarios__comercial_ extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 95%;">
  <vaadin-vertical-layout style="width: 60%; align-items: center; justify-content: center;">
   <img style="height: 100%;" src="../../resources/icons/video.svg">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 40%; align-items: center;">
   <iron-icon style="width: 20%; height: 20%;" src="../../resources/icons/user.svg"></iron-icon>
   <label>Usuario </label>
   <vaadin-horizontal-layout style="width: 100%; justify-content: space-around;">
    <vaadin-horizontal-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center;">
     <label>Fecha</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: center;">
     <label>Ubicacion</label>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vista-comentario__comercial_ style="width: 100%; height: 50%; margin-top: var(--lumo-space-xl);"></vista-comentario__comercial_>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; margin-top: var(--lumo-space-xl); margin-right: var(--lumo-space-s); justify-content: flex-end;">
    <vaadin-button>
     Anterior 
    </vaadin-button>
    <vaadin-button>
     Eliminar
    </vaadin-button>
   </vaadin-horizontal-layout>
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
