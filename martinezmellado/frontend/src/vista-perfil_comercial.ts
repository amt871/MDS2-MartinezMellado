import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';

@customElement('vista-perfil_comercial')
export class VistaPerfil_comercial extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: absolute;">
 <vaadin-vertical-layout style="width: 100%; height: 5%;">
  <div id="divCabecera" style="width: 100%; height: 100%;"></div>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout style="width: 100%; justify-content: space-between; height: 20%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: center; align-items: center; justify-content: center;">
   <label id="labelSeguidores">Numero de seguidores</label>
  </vaadin-horizontal-layout>
  <img style="max-height: 95%;" id="imagen">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: center; align-items: center; justify-content: center;">
   <label id="labelMeGustas">Numero de me gustas</label>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; align-items: center; justify-content: center; height: 5%;">
  <label id="labelUsuario">Usuario</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; align-items: center; justify-content: center; height: 5%;">
  <vaadin-button id="bConfigurar">
    Configurar 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="width: 100%; height: 65%;">
  <vaadin-scroller id="scroller" style="width: 100%; height: 100%;"></vaadin-scroller>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
