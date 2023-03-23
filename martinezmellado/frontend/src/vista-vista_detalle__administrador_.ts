import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera__administrador_';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import './vista-comentario__administrador__item';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vista-cabecera__administrador_ style="width: 100%; align-self: center; flex-shrink: 1; height: 6%;"></vista-cabecera__administrador_>
 <vaadin-horizontal-layout style="height: 100%; width: 100%; flex-shrink: 1; flex-grow: 1;">
  <img style="width: 60%; height: 100%;" src="../../resources/icons/video.png">
  <vaadin-vertical-layout style="align-items: center; justify-content: flex-start; flex-grow: 1; flex-shrink: 1;">
   <iron-icon style="width: 15%; height: 10%;" icon="lumo:user"></iron-icon>
   <label>Usuario de la publicacion</label>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; justify-content: center; margin-top: var(--lumo-space-m);">
    <label>Fecha</label>
    <label>Ubicacion</label>
   </vaadin-horizontal-layout>
   <label style="margin-top: 5%;">Comentarios</label>
   <vaadin-scroller style="width: 100%; height: 65%;">
    <vista-comentario__administrador__item></vista-comentario__administrador__item>
    <vista-comentario__administrador__item></vista-comentario__administrador__item>
    <vista-comentario__administrador__item></vista-comentario__administrador__item>
   </vaadin-scroller>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: center; margin-top: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 1; justify-content: flex-start; align-items: flex-end; margin-bottom: var(--lumo-space-xl);">
    <vaadin-vertical-layout style="flex-shrink: 1; flex-grow: 0; width: 30%; align-items: center; justify-content: center; align-self: flex-end;">
     <label style="align-self: center;">Me gustas </label>
     <iron-icon style="align-self: center; flex-grow: 0; flex-shrink: 1; width: 20%; height: 20%;" icon="vaadin:heart"></iron-icon>
    </vaadin-vertical-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: space-between; flex-shrink: 0; flex-grow: 1; margin-right: var(--lumo-space-xl);">
     <vaadin-button style="align-self: center;">
      Anterior
     </vaadin-button>
     <vaadin-button style="align-self: center;">
      Eliminar
     </vaadin-button>
    </vaadin-horizontal-layout>
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
