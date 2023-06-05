import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-mi_perfil')
export class VistaMi_perfil extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; position: absolute;">
 <vaadin-vertical-layout style="height: 5%; width: 100%;">
  <div id="divCabecera" style="width: 100%; height: 100%;"></div>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout style="width: 100%; align-items: center; justify-content: center; height: 20%;">
  <vaadin-horizontal-layout style="width: 100%; height: 100%; align-self: center; align-items: center; justify-content: flex-end;">
   <label id="idNumSeguidores">Numero de seguidores</label>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout style="align-items: center; align-self: center; justify-content: center;">
   <img id="idImagen" style="width: 30%;">
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 100%; align-self: center; align-items: center; justify-content: flex-start;">
   <label id="idNumMgs">Numero de me gustas</label>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <label id="idUsuario" style="height: 5%;">Usuario </label>
 <vaadin-button style="height: 5%;" id="bConfigurar">
   Configurar 
 </vaadin-button>
 <vaadin-scroller id="Scroller" style="width: 100%; height: 65%;"></vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
