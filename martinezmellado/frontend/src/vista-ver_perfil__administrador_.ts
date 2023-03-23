import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera__administrador_';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-video_otro_usuario_perfil__administrador_';

@customElement('vista-ver_perfil__administrador_')
export class VistaVer_perfil__administrador_ extends LitElement {
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
 <vista-cabecera__administrador_ style="width: 100%; height: 5%;"></vista-cabecera__administrador_>
 <vaadin-button style="align-self: flex-end; margin-right: var(--lumo-space-m); width: 10%;">
  Bloquear 
 </vaadin-button>
 <vaadin-horizontal-layout style="width: 100%; height: 10%; justify-content: space-between;">
  <vaadin-horizontal-layout theme="spacing" style="width: 33%; align-self: center; justify-content: center; align-items: center;">
   <label>Numero de seguidores</label>
  </vaadin-horizontal-layout>
  <img style="height: 100%;" src="../../resources/icons/user.svg">
  <vaadin-horizontal-layout theme="spacing" style="width: 33%; align-self: center; align-items: center; justify-content: center;">
   <label>Numero de me gustas</label>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center;">
  <label style="margin-top: var(--lumo-space-m); margin-bottom: var(--lumo-space-m);">Perfil privado</label>
 </vaadin-horizontal-layout>
 <vista-video_otro_usuario_perfil__administrador_ style="width: 100%; height: 100%;"></vista-video_otro_usuario_perfil__administrador_>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
