import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-ver_perfil__usuario_registrado_';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-ver_perfil_privado__usuario_registrado_')
export class VistaVer_perfil_privado__usuario_registrado_ extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vista-ver_perfil__usuario_registrado_ style="width: 100%; height: 45%;"></vista-ver_perfil__usuario_registrado_>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; justify-content: flex-start; align-items: center;">
  <vaadin-button style="height: 100%;">
    Seguir 
  </vaadin-button>
  <label>Perfil privado</label>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
