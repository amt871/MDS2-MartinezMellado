import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cabecera__administrador_';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-video_otro_usuario__administrador_')
export class VistaVideo_otro_usuario__administrador_ extends LitElement {
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
 <vista-cabecera__administrador_ style="flex-grow: 0; width: 100%; height: 6%;"></vista-cabecera__administrador_>
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;">
  <img style="width: 60%; height: 100%;" src="../../resources/icons/video.png">
  <vaadin-vertical-layout style="height: 100%; align-items: center; flex-grow: 1; flex-shrink: 0;">
   <iron-icon style="width: 15%; height: 10%;" icon="lumo:user"></iron-icon>
   <label>Usuario de la publicacion </label>
   <vaadin-horizontal-layout theme="spacing">
    <label>Fecha</label>
    <label>Ubicacion</label>
   </vaadin-horizontal-layout>
   <label>Descripcion</label>
   <vaadin-text-area label="" placeholder="" style="width: 80%; height: 40%; margin: var(--lumo-space-m);"></vaadin-text-area>
   <vaadin-horizontal-layout theme="spacing" style="align-items: flex-start; justify-content: space-around; align-self: center; width: 90%;">
    <vaadin-vertical-layout theme="spacing" style="align-self: flex-start; align-items: center;">
     <iron-icon icon="vaadin:heart"></iron-icon>
     <label>Me gustas</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="align-items: center;">
     <iron-icon icon="vaadin:comments"></iron-icon>
     <label>Comentarios</label>
     <vaadin-button>
       Ver comentarios 
     </vaadin-button>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-button style="align-self: flex-end; margin-top: 5%; margin-right: 5%; width: 30%; height: 5%; flex-shrink: 1;">
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
