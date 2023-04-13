import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-mi_cabecera';

@customElement('vista-ver_perfil__usuario_registrado_')
export class VistaVer_perfil__usuario_registrado_ extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center;">
 <vista-mi_cabecera style="width: 100%; height: 100%;"></vista-mi_cabecera>
 <vaadin-horizontal-layout style="height: 100%; justify-content: space-between; width: 100%;">
  <vaadin-horizontal-layout style="width: 100%; align-self: center; justify-content: center; align-items: center; height: 100%;">
   <label>Numero de seguidores</label>
  </vaadin-horizontal-layout>
  <img style="height: 20%; width: 20%;" src="../../resources/icons/user.svg">
  <vaadin-horizontal-layout style="width: 100%; align-self: center; align-items: center; justify-content: center; height: 100%;">
   <label>Numero de me gustas</label>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
