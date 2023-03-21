import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera__administrador_';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';
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
 <vista-cabecera__administrador_ style="width: 100%; height: 6%;"></vista-cabecera__administrador_>
 <vaadin-horizontal-layout style="height: 100%; width: 100%;">
  <img style="width: 60%; height: 100%;" src="../../resources/icons/video.png">
  <vaadin-vertical-layout style="align-items: center; justify-content: flex-start; flex-grow: 1; flex-shrink: 1;">
   <iron-icon style="width: 15%; height: 10%;" icon="lumo:user"></iron-icon>
   <label>Usuario de la publicacion</label>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; justify-content: center; margin-top: var(--lumo-space-m);">
    <label>Fecha</label>
    <label>Ubicacion</label>
   </vaadin-horizontal-layout>
   <label style="margin-top: 5%;">Comentarios</label>
   <vaadin-scroller style="flex-grow: 0; flex-shrink: 1; width: 100%; height: 10%;">
    <vista-comentario__administrador__item></vista-comentario__administrador__item>
    <vista-comentario__administrador__item></vista-comentario__administrador__item>
    <vista-comentario__administrador__item></vista-comentario__administrador__item>
   </vaadin-scroller>
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
