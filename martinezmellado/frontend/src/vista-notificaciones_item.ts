import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-notificaciones_item')
export class VistaNotificaciones_item extends LitElement {
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
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-items: center;">
 <vaadin-vertical-layout theme="spacing" style="height: 100%; align-self: center; justify-content: center; width: 100%;">
  <iron-icon id="idFotoUsuario" style="width: 100%; height: 20%;" icon="lumo:user"></iron-icon>
  <label id="idNombreUsuario" style="align-self: center;">Nombre de usuario</label>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <label id="idTextoNotificación" style="align-self: center;">Texto de la notificacion</label>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; align-self: center;">
  <img id="idVideoRelacionado" style="width: 100%; height: 15%;" src="../../resources/icons/java.svg">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; align-self: center; align-items: center;">
  <vaadin-button id="idBotonVista">
   Vista 
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
