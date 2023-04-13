import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_usuario_no_registrado';
import './vista-video_otro_usuario__no_registrado_';

@customElement('vista-ver_perfil__usuario_no_registrado_')
export class VistaVer_perfil__usuario_no_registrado_ extends LitElement {
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
 <vista-cabecera_usuario_no_registrado style="width: 100%; height: 5%;"></vista-cabecera_usuario_no_registrado>
 <vaadin-horizontal-layout style="height: 10%; justify-content: space-between; width: 100%;">
  <vaadin-horizontal-layout style="width: 100%; align-self: center; justify-content: center; align-items: center;">
   <label>Numero de seguidores</label>
  </vaadin-horizontal-layout>
  <img style="height: 100%;" src="../../resources/icons/user.svg">
  <vaadin-horizontal-layout style="width: 100%; align-self: center; align-items: center; justify-content: center;">
   <label>Numero de me gustas</label>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vista-video_otro_usuario__no_registrado_></vista-video_otro_usuario__no_registrado_>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
