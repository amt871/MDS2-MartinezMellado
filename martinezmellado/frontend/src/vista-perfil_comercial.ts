import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_comercial';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-mi_video__comercial_';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vista-cabecera_comercial style="width: 100%; height: 5%;"></vista-cabecera_comercial>
 <vaadin-horizontal-layout style="width: 100%; justify-content: space-between; height: 20%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: center; align-items: center; justify-content: center;">
   <label>Numero de seguidores</label>
  </vaadin-horizontal-layout>
  <img style="height: 100%;" src="../../resources/icons/user.svg">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: center; align-items: center; justify-content: center;">
   <label>Numero de me gustas</label>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; align-items: center; justify-content: center; height: 5%;">
  <label>Usuario</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; align-items: center; justify-content: center; height: 5%;">
  <vaadin-button>
    Configurar 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vista-mi_video__comercial_ style="flex-grow: 0; flex-shrink: 1; width: 100%; align-self: stretch; height: 75%;"></vista-mi_video__comercial_>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
