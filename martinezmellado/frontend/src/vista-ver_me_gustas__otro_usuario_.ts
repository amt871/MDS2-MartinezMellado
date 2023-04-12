import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-mi_cabecera';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import './vista-me_gusta__otro_usuario_';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-ver_me_gustas__otro_usuario_')
export class VistaVer_me_gustas__otro_usuario_ extends LitElement {
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
 <vista-mi_cabecera style="width: 100%; height: 5%;"></vista-mi_cabecera>
 <vaadin-horizontal-layout style="width: 100%; height: 95%;">
  <vaadin-vertical-layout style="height: 100%; width: 60%; align-items: center; justify-content: center;">
   <img style="width: 90%; height: 90%;" src="../../resources/icons/video.svg">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 40%; height: 100%; align-items: center; justify-content: center;">
   <iron-icon style="width: 20%; height: 20%;" src="../../resources/icons/user.svg"></iron-icon>
   <vista-me_gusta__otro_usuario_ style="width: 90%; height: 60%;"></vista-me_gusta__otro_usuario_>
   <vaadin-button style="align-self: flex-start; margin-left: var(--lumo-space-xl); margin-top: var(--lumo-space-xl);">
    Anterior
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
