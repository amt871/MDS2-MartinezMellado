import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: absolute;">
 <div id="divCabecera" style="width: 100%; height: 5%;"></div>
 <vaadin-button style="align-self: flex-end; width: 10%; height: 5%; margin-right: var(--lumo-space-s);" id="bBloquear">
   Bloquear 
 </vaadin-button>
 <vaadin-horizontal-layout style="height: 10%; justify-content: space-between; width: 100%;">
  <vaadin-horizontal-layout style="width: 100%; align-self: center; justify-content: center; align-items: center;">
   <label id="labelSeguidores">Numero de seguidores</label>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing">
   <img style="max-height: 95%; max-width: 95%;" id="image">
   <label id="labelUsuario">Label</label>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout style="width: 100%; align-self: center; align-items: center; justify-content: center;">
   <label id="labelMeGustas">Numero de me gustas</label>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="align-self: center; align-items: center; justify-content: center; width: 100%; height: 5%;">
  <label id="labelPrivado">Perfil privado</label>
 </vaadin-horizontal-layout>
 <div id="divScroller" style="width: 100%; height: 75%;">
  <vaadin-scroller id="scroller" style="width: 100%; height: 100%;"></vaadin-scroller>
 </div>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
