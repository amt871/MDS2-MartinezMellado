import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_usuario_no_registrado';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-video_otro_usuario__no_registrado_';

@customElement('vista-ver_perfil_publico__usuario_no_registrado_')
export class VistaVer_perfil_publico__usuario_no_registrado_ extends LitElement {
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
 <vista-cabecera_usuario_no_registrado style="width: 100%; height: 5%;"></vista-cabecera_usuario_no_registrado>
 <vaadin-horizontal-layout style="width: 100%; height: 10%; align-items: center; justify-content: space-between;">
  <vaadin-horizontal-layout style="width: 100%; justify-content: center; align-items: center;">
   <label>Numero de seguidores</label>
  </vaadin-horizontal-layout>
  <img style="height: 100%;" src="../../resources/icons/user.svg">
  <vaadin-horizontal-layout style="width: 100%; align-items: center; justify-content: center;">
   <label>Numero de me gustas</label>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; justify-content: center; align-items: center; height: 5%;">
  <label>Usuario</label>
 </vaadin-horizontal-layout>
 <vista-video_otro_usuario__no_registrado_ style="width: 100%; height: 100%;"></vista-video_otro_usuario__no_registrado_>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
