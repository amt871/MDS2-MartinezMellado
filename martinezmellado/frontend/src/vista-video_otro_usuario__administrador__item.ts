import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-video_otro_usuario__administrador__item')
export class VistaVideo_otro_usuario__administrador__item extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout style="width: 60%; height: 100%; align-self: center; align-items: center; justify-content: center;">
  <img style="align-self: flex-start; width: 90%; height: 90%;" src="../../resources/icons/video.svg" id="video">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 40%; height: 100%; align-self: center; align-items: center; justify-content: center;">
  <img style="width: 30%;" src="../../resources/icons/user.svg" id="imgUsuario">
  <label id="labelUsuario">Usuario</label>
  <vaadin-horizontal-layout theme="spacing-s" style="width: 100%; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center; width: 50%;" id="labelubi">
    <label style="width: 50%; align-self: center;" id="labelUbi">Ubicacion</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="justify-content: center; align-items: center; align-self: center; width: 50%;">
    <label style="width: 50%; align-self: center;" id="labelFecha">Fecha de publicacion</label>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <label style="margin-top: var(--lumo-space-l); margin-bottom: var(--lumo-space-l);" id="labelDescripcion">Descripcion</label>
  <vaadin-horizontal-layout style="width: 100%; margin-bottom: var(--lumo-space-xl);">
   <vaadin-vertical-layout theme="spacing" style="width: 50%; align-items: center; justify-content: center; align-self: center;">
    <iron-icon icon="vaadin:heart"></iron-icon>
    <label id="labelNumMg">Me gustas</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 50%; align-self: center; align-items: center; justify-content: center;">
    <iron-icon icon="vaadin:comments"></iron-icon>
    <label>Comentarios</label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-button style="align-self: flex-end; margin-top: var(--lumo-space-xl); margin-right: var(--lumo-space-l); flex-shrink: 1;" id="bDenunciar">
    Denunciar 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
