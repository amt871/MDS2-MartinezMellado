import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cabecera_usuario_no_registrado';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-ver_perfil_privado__usuario_no_registrado_')
export class VistaVer_perfil_privado__usuario_no_registrado_ extends LitElement {
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
 <vaadin-vertical-layout style="width: 100%; height: 95%; align-items: center;">
  <vaadin-horizontal-layout style="width: 100%; justify-content: center; height: 100%; align-items: center;">
   <vaadin-horizontal-layout style="width: 100%; justify-content: center; align-items: center;">
    <label>Numero de seguidores </label>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout style="width: 100%; align-items: center; justify-content: center;">
    <img style="height: 60%;" src="../../resources/icons/user.svg">
    <label>Perfil privado</label>
   </vaadin-vertical-layout>
   <vaadin-horizontal-layout style="width: 100%; align-items: center; justify-content: center;">
    <label>Numero de me gustas</label>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}