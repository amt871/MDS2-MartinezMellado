import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-administrar')
export class VistaAdministrar extends LitElement {
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
 <vaadin-vertical-layout style="height: 5%; width: 100%;">
  <div id="divCabecera" style="width: 100%; height: 100%;"></div>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; height: 5%; align-items: center; justify-content: center;">
  <vaadin-button style="width: 20%;" id="bTodas">
    Todas 
  </vaadin-button>
  <vaadin-button style="width: 20%;" id="bPendientes">
    Pendientes 
  </vaadin-button>
  <vaadin-button style="width: 20%;" id="bVistas">
    Vistas 
  </vaadin-button>
  <vaadin-button style="width: 20%;" id="bAplicadas">
    Aplicadas 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="height: 90%; width: 100%;">
  <div id="divScrollerDenuncias" style="width: 100%; height: 100%; flex-shrink: 0;"></div>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
