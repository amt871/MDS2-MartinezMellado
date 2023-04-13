import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-ver_perfil__usuario_registrado_';
import './vista-video_otro_usuario_perfil__administrador_';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-ver_perfil_publico__usuario_registrado_')
export class VistaVer_perfil_publico__usuario_registrado_ extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center;">
 <vista-ver_perfil__usuario_registrado_ style="width: 100%; height: 45%;"></vista-ver_perfil__usuario_registrado_>
 <vaadin-button>
  Seguir
 </vaadin-button>
 <vista-video_otro_usuario_perfil__administrador_></vista-video_otro_usuario_perfil__administrador_>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
